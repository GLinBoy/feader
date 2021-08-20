package com.glinboy.feader.service.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public abstract class AuditableDTO implements Serializable {
  private static final long serialVersionUID = -2468866069782427130L;
  private String createdBy;
  private String editedBy;
  private Date createdOn;
  private Date editedOn;
  private Long version;

}
