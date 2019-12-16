class MorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> morseSet = new HashSet<String>();
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i<words.length;i++){
            String morseCode = "";
            for(int j = 0; j<words[i].length();j++){
                // System.out.println(words[i].charAt(j));
                morseCode+=morse[alphabet.indexOf(words[i].charAt(j))];
            }
            morseSet.add(morseCode);
        }
         
        return morseSet.size();
    }
}