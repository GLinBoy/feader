package com.glinboy.feader.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class FeedDTO extends BaseDTO {

  private String title;
  private String link;
  private String description;

}
