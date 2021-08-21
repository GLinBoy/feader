package com.glinboy.feader.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class FeedDTO extends BaseDTO {

  private static final long serialVersionUID = -1407843207440574472L;
  private String title;
  private String link;
  private String description;

}
