/**
 * A Java Client application that interacts with the Google Gemini 2.5 Pro Preview model using the Vertex AI Java SDK.
 */
package org.example;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.api.GenerateContentResponse;

import java.io.IOException;

/**
 * Main class to run the application.
 */
public class Main {
    private static final String PROJECT_ID = "";
    private static final String LOCATION = "";

    public static void main(String[] args) throws IOException {
        try (VertexAI vertexAI = new VertexAI(PROJECT_ID, LOCATION);) {
            GenerativeModel model = new GenerativeModel("gemini-2.5-pro-preview-05-06", vertexAI);
            String question = "How are you doing?";

            GenerateContentResponse response = model.generateContent(question);
            String responseText = response.getCandidates(0).getContent().getParts(0).getText();

            System.out.println("Question: " + question);
            System.out.println("Response: " + responseText);
        }
    }
}