package com.company.libraryapi.api.resource;

import com.company.libraryapi.api.dto.BookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookDTO create() {
        BookDTO dto = new BookDTO();
        dto.setAuthor("Autor");
        dto.setId(11L);
        dto.setTitle("Meu livro");
        dto.setIsbn("123");
        return dto;
    }
}
