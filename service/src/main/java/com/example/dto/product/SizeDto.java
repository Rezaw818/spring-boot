package com.example.dto.product;

import com.example.dto.file.FileDto;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SizeDto {

    private Long id;

    private String title;

    private String description;
}
