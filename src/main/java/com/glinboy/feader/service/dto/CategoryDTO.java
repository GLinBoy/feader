package com.glinboy.feader.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class CategoryDTO extends BaseDTO {

  private static final long serialVersionUID = -4171512062504996945L;
  private String name;
  private Short weight;

}
