package com.example.hodgepodge.bloomfilter;

import java.util.BitSet;

/**
 * hodgepodge
 *
 * @author ysh11973
 * 2020年12月02日15:19
 */
public class MyBloomFilter {
    private static final int DEFAULT_SIZE = 2 << 24;
    private static final int[] seeds = new int[]{3,13,46,71,91,134};
    private BitSet bitSet = new BitSet(DEFAULT_SIZE);
    private SimpleHash[] func = new SimpleHash[seeds.length];

    /**
     * 初始化多个包含 hash 函数的类的数组，每个类中的 hash 函数都不一样
     */
    public MyBloomFilter(){
        for (int i =0;i<seeds.length;i++){
            func[i] = new SimpleHash(DEFAULT_SIZE,seeds[i]);
        }
    }

    //添加
    public void add(Object value){
        for (SimpleHash simpleHash : func) {
            bitSet.set(simpleHash.hash(value),true);
        }
    }

    //查找
    public boolean contains(Object value){
        boolean ret = true;
        for (SimpleHash simpleHash : func) {
            ret = ret && bitSet.get(simpleHash.hash(value));
        }
        return ret;
    }

    /**
     * 静态内部类。用于 hash 操作！
     */
    public static class SimpleHash {

        private int cap;
        private int seed;

        public SimpleHash(int cap, int seed) {
            this.cap = cap;
            this.seed = seed;
        }

        /**
         * 计算 hash 值
         */
        public int hash(Object value) {
            int h;
            return (value == null) ? 0 : Math.abs(seed * (cap - 1) & ((h = value.hashCode()) ^ (h >>> 16)));
        }

    }
}
