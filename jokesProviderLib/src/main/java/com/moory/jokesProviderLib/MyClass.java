package com.moory.jokesProviderLib;


public class MyClass {

    String jokes [] = new String[]{
            "Two elephants meet a totally naked guy. After a while one elephant says to the other: “I really don’t get how he can feed himself with that thing!”",
            "I just got a photo from a speeding camera through the mail. I sent it right back – way too expensive and really bad quality.",
            "When my wife starts to sing I always go out and do some garden work so our neighbors can see there's no domestic violence going on.",
            "My friend Robbie shocked and hurt me. He told me today that I make people very uncomfortable and have no respect for personal space. I mean, what a thing to say to a friend? It totally ruined our bath!",
            "I hate people who take drugs. DEA is the worst.",
    };

    public String getJoke(){
        return jokes[(int) (Math.random() * 4)];
    }





}
