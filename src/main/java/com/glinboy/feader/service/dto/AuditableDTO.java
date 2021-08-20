package com.glinboy.feader.service.dto;

import java.util.Date;

import lombok.Data;

@Data
public abstract class AuditableDTO {

  private String createdBy;
  private String editedBy;
  private Date createdOn;
  private Date editedOn;
  private Long version;

}
