package com.arcanamind.arcanamind_api.Service;

import com.arcanamind.arcanamind_api.DTO.TarotRequest;
import com.arcanamind.arcanamind_api.Util.OpenAIUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TarotService {

    private final OpenAIUtil openAIUtil;

    public String getReading(TarotRequest request) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("You are a mystical tarot reader.\n");
        prompt.append("User's question: ").append(request.getUserQuestion()).append("\n");
        prompt.append("Cards drawn:\n");

        for (int i = 0; i < request.getCards().size(); i++) {
            prompt.append(i + 1).append(". ").append(request.getCards().get(i)).append("\n");
        }

        prompt.append("Give a thoughtful, emotionally deep 3 paragraph tarot reading.");

        return openAIUtil.callOpenAI(prompt.toString());
    }
}
