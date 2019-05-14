package org.eyalgo.testing.example.domain;

import java.util.Date;
import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Value
@Builder(toBuilder = true)
@Table("users")
public class User {
  @NonNull
  @PrimaryKey
  UUID id;
  @NonNull
  @Column("first_name")
  String firstName;
  @NonNull
  @Column("last_name")
  String lastName;
  String info;
  @NonNull
  Date created;
  @NonNull
  @Column("last_updated")
  Date lastUpdated;
}
