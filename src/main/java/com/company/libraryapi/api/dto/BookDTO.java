package com.company.libraryapi.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BookDTO {
    private Long id;
    private String title;
    private String isbn;
    private String author;
}
