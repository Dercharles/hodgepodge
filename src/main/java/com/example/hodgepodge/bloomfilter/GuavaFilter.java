package com.example.hodgepodge.bloomfilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;

/**
 * hodgepodge
 *
 * @author ysh11973
 * 2020年12月02日16:53
 */
public class GuavaFilter {


    public GuavaFilter() {
        BloomFilter<String> filter = BloomFilter.create(
                Funnels.stringFunnel(Charset.defaultCharset()),
                1500,
                0.01);

        filter.mightContain("dddd");
        filter.put("dddd");
        System.out.println(filter.mightContain("dddd"));
    }
}
