package com.glinboy.feader.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
// FIXME add  extends Auditable<String> and @EqualsAndHashCode(callSuper=true)
public abstract class BaseModel implements Serializable {

	private static final long serialVersionUID = 4044849860361438135L;
	@Id
	@GeneratedValue
	@Column(name = "ID", updatable = false, nullable = false)
	private Long id;
}
