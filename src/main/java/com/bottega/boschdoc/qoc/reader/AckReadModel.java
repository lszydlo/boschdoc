package com.bottega.boschdoc.qoc.reader;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDate;

@Data
@Entity
public class AckReadModel {
	@Id
	private String id;
	private LocalDate dueDate;
	private boolean status;
//	@Transient
	private String username;
}
