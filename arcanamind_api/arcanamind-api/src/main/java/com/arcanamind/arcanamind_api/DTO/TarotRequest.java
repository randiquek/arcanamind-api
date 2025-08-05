package com.arcanamind.arcanamind_api.DTO;

import lombok.Data;

import java.util.List;

@Data
public class TarotRequest {
    private List<String> cards;
    private String userQuestion;

}
