package com.example.hodgepodge.bloomfilter;

/**
 * hodgepodge
 *
 * @author ysh11973
 * 2020年12月02日15:35
 */
public class BloomClient {
    public static void main(String[] args) {
        MyBloomFilter myBloomFilter = new MyBloomFilter();
        myBloomFilter.add("1111111");
        myBloomFilter.add("3333333");
        System.out.println(myBloomFilter.contains("1111111"));
        System.out.println(myBloomFilter.contains("2222222"));
        GuavaFilter guavaFilter = new GuavaFilter();
    }
}
