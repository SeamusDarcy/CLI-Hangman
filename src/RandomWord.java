public class RandomWord {
    private static final String[] WORDS = {
            "apple", "banana", "orange", "grape", "lemon",
            "mango", "cherry", "peach", "melon", "papaya",

            "carrot", "potato", "tomato", "onion", "garlic",
            "pepper", "celery", "lettuce", "spinach", "radish",

            "hammer", "ladder", "wrench", "pliers", "socket",
            "chisel", "mallet", "anvil", "tongs", "screws",

            "forest", "desert", "jungle", "island", "ocean",
            "river", "valley", "canyon", "meadow", "glacier",

            "planet", "galaxy", "comet", "meteor", "rocket",
            "orbit", "lunar", "solar", "cosmic", "nebula",

            "knight", "castle", "dragon", "wizard", "goblin",
            "sword", "shield", "armor", "crown", "throne",

            "guitar", "violin", "trumpet", "piano", "banjo",
            "flute", "drums", "singer", "melody", "rhythm",

            "laptop", "tablet", "mobile", "camera", "router",
            "server", "screen", "mouse", "keypad", "cursor",

            "travel", "journey", "ticket", "hotel", "flight",
            "luggage", "border", "visaed", "tourist", "driver",

            "winter", "summer", "spring", "autumn", "breeze",
            "stormy", "cloudy", "sunny", "thunder", "rainbow"
    };

    private RandomWord() {
        // Prevent Instantiation
    }

    public static String getWord() {
        int r = (int) (Math.random() * WORDS.length);
        return WORDS[r];
    }



}
