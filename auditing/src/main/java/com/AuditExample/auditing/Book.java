package com.AuditExample.auditing;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.springframework.data.domain.Auditable;

import java.io.Serializable;

@Entity
@Table(name="Book")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Audited()
public class Book  {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long pages;

}
