package com.borqs.server.market.utils;


import java.util.*;

public class CollectionUtils2 {
    public <C extends Collection<Integer>> C toCollection(C result, int... a) {
        if (result != null && a != null) {
            for (int val : a)
                result.add(val);
        }
        return result;
    }

    public <C extends Collection<Long>> C toCollection(C result, long... a) {
        if (result != null && a != null) {
            for (long val : a)
                result.add(val);
        }
        return result;
    }

    public List<Integer> asList(int... a) {
        return toCollection(new ArrayList<Integer>(), a);
    }

    public List<Long> asList(long... a) {
        return toCollection(new ArrayList<Long>(), a);
    }

    public Set<Integer> asSet(int... a) {
        return toCollection(new LinkedHashSet<Integer>(), a);
    }

    public Set<Long> asSet(long... a) {
        return toCollection(new LinkedHashSet<Long>(), a);
    }
}
