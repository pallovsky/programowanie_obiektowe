package projekt;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InteliCwDB extends CwDB {

    @Override
    public void add(String new_word, String new_clue) {
        super.add(new_word, new_clue);
        LinkedList<Entry> list = dict;
        Collections.sort(list, new Comparator<Entry>() {
            @Override
            public int compare(Entry e1, Entry e2) {
                return Collator.getInstance().compare(e1.getWord(), e2.getWord());
            }
        });
    }

    public InteliCwDB(String filename){
        super(filename);
    }

    public LinkedList<Entry> findAll(String pattern){
        LinkedList<Entry> result = new LinkedList<>();
        Pattern p = Pattern.compile(pattern);

        for (Entry aDict : dict) {
            Matcher m = p.matcher(aDict.getWord());
            if (m.find()){
                result.add(aDict);
            }
        }
        return result;
    }

    public Entry getRandom(){
        Random rand = new Random();
        int random = rand.nextInt(dict.size());
        return dict.get(random);
    }

    public Entry getRandom(int length){
        LinkedList<Entry> list = new LinkedList<>();
        for (Entry aDict : dict) {
            if (aDict.getWord().length() == length){
                list.add(aDict);
            }
        }
        Random rand = new Random();
        int random = rand.nextInt(list.size());
        return list.get(random);
    }

    public Entry getRandom(String pattern){
        LinkedList<Entry> list = this.findAll(pattern);
        if (!list.isEmpty()){
            Random rand = new Random();
            int random = rand.nextInt(list.size());
            return list.get(random);
        }
        else {
            return this.getRandom(pattern);
        }
    }


}

