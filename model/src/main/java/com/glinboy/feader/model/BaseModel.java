package com.glinboy.feader.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

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
