package com.glinboy.feader.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class CategoryDTO extends BaseDTO {

  private String name;
  private Short weight;

}
