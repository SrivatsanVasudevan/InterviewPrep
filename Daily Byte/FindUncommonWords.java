/*
Given two strings representing sentences, return the words that are not common to both strings (i.e. the words that only appear in one of the sentences). You may assume that each sentence is a sequence of words (without punctuation) correctly separated using space characters.

Ex: given the following strings...

sentence1 = "the quick", sentence2 = "brown fox", return ["the", "quick", "brown", "fox"]
sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire", return ["beat", "to", "lost"]
sentence1 = "copper coffee pot", sentence2 = "hot coffee pot", return ["copper", "hot"]
*/

public static List<String> findUncommonWord(String s1, String s2){
        if(s1 == null && s2 == null) return new ArrayList<>();
        
        HashSet<String> set = new HashSet<>();
        List<String> result = new ArrayList<>();
        String sentences1[] = s1.split(" ");
        String sentences2[] = s2.split(" ");
        for(String sentence:sentences1){
            set.add(sentence);
            result.add(sentence);
        }
        //System.out.println(result);
        for(String sentence:sentences2){
            if(!set.contains(sentence)){
                result.add(sentence);
            }
            else{
                result.remove(sentence);
            }
        }//System.out.println(result);
        return result;
    }
