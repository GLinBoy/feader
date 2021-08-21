package com.glinboy.feader.service.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public abstract class BaseDTO implements Serializable {

  private static final long serialVersionUID = -4865116964261227697L;
  private Long id;

}
