package TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends AbstractBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    boolean customerWantsCondiments() {
        if (askAboutCondiments().toUpperCase().startsWith("Y")) {
            return true;
        }
        return false;
    }

    private String askAboutCondiments() {
        String answer = null;
        System.out.println("Would you like condiments? (Y/N)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
