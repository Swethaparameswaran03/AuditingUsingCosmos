package com.roms.auth.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data

public abstract class Auditable<T> implements Serializable {

	
	@CreatedBy
	protected T createdBy;
	
    @CreatedDate
    private LocalDateTime  creationDate=LocalDateTime.now();


	@LastModifiedDate
	private LocalDateTime  lastModifiedDate;

	
	@LastModifiedBy
	protected T modifiedBy;

}