package com.ankitshahit.ftpweb.core.user;

import com.ankitshahit.ftpweb.core.Tables;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = Tables.T_CLIENT)
public class Client {
    @Id
    private Long clientId;
    private String name;
    @Column(unique = true)
    private String email;
    private String hash;
    @Enumerated(value = EnumType.ORDINAL)
    private AccountStatus accountStatus;
}
