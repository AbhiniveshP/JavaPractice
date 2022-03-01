package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        String url = urls.get(lastIndex);
        urls.remove(url);
        return url;
    }

    public Iterator<String> createIterator() {
        return new ListIterator<String>(urls);
    }

    public List<String> getUrls() {
        return urls;
    }
}
