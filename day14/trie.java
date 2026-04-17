package day14;

import java.util.Map;
import java.util.HashMap;

public class trie {
    private TrieNode root;

    public trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (!node.children.containsKey(c)) {
                node.children.put(c, new TrieNode());
            }
            node = node.children.get(c);
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (!node.children.containsKey(c)) {
                return false;
            }
            node = node.children.get(c);
        }
        return true;
    }

    private class TrieNode {
        private Map<Character, TrieNode> children = new HashMap<>();
        private boolean isEndOfWord;
    }

    public static void main(String[] args) {
        trie obj = new trie();
        obj.insert("hello");
        System.out.println(obj.search("hello")); 
        System.out.println(obj.search("hell"));  
        System.out.println(obj.startsWith("hell")); 
        System.out.println(obj.startsWith("world")); 
    }
}
