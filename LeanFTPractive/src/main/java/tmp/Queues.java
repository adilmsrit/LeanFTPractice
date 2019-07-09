package tmp;

import java.util.HashMap;

public class Queues {

    public static void main(String[] args) {

        //Common use of hashMaps. Which character is most repeated?
        String s = "phonebook";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (hashMap.containsKey(currentChar)) {
                // increment current value for this key in hashmap by 1.
                hashMap.put(currentChar, hashMap.get(currentChar) + 1);
            }
            else {
                // IF we have not added it to the hashmap then put it in with the value.
                hashMap.put(currentChar, 1);
            }
        }

        Character mostRepeated = ' ';
        int max = 0;
        for (Character key : hashMap.keySet()) {
            int currentValue = hashMap.get(key);
            if (currentValue > max) {
                mostRepeated = key;
                max = currentValue;
            }
        }
        System.out.println("Most Repeated: " + mostRepeated + " | Times: " + max);





















     /*   HashMap<String, Integer> wordToNum = new HashMap<>();

        wordToNum.put("ONE", 1);
        wordToNum.put("TWO", 2);
        wordToNum.put("THREE", 3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);

        System.out.println(wordToNum.get("THREE"));

        System.out.println(wordToNum.values());

        System.out.println(wordToNum.keySet());

        System.out.println(wordToNum.remove("FOUR"));

        System.out.println(wordToNum);

        */



        /*

        Stack<String> deckOfCards = new Stack<String>();

        String card1 = "Jack : Diamonds";
        String card2 = "8 : Hearts";
        String card3 = "3 : Clubs";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);

        System.out.println(deckOfCards);

        System.out.println(deckOfCards.peek());

        deckOfCards.pop();
        System.out.println(deckOfCards);
*/



/*
static Queue<String> queue = new LinkedList<>();
        queue.add("Sam");
        queue.add("Anna");
        queue.add("Heidi");
        queue.add("Susan");
        queue.add("Charlotte");

        System.out.println(queue);

        System.out.println(queue.peek());

        queue.remove();

        System.out.println(queue);

*/

    }
}
