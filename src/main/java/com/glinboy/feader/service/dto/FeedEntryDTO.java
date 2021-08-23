package com.glinboy.feader.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class FeedEntryDTO extends BaseDTO {

  private String title;
  private String description;
  private String link;
  private String author;
  private String guid;
  private Long feedId;
}
