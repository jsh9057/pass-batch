package com.jsh.pass.repository;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @CreatedDate
    @Column(updatable = false, unique = false) // 업데이트를 하지 않도록, null이 되지 않도록 명시합니다.
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;

}
