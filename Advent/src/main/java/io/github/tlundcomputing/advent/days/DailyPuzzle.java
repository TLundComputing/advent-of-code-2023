/*
 * The MIT License
 *
 * Copyright (c) 2023 TLundComputing.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.github.tlundcomputing.advent.days;

import java.util.*;
import java.io.*;
import java.net.URISyntaxException;

/**
 *
 * @author TLundComputing
 */
public abstract class DailyPuzzle {
    
    protected ArrayList<String> data;
    
    public DailyPuzzle(String filename){
        data = new ArrayList<>();
        try {
            File file = new File(DailyPuzzle.class.getResource( "LICENSE" ).toURI());
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                data.add(scan.nextLine().strip());
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        } catch (URISyntaxException e){
            System.out.println(e.getMessage());
        }
    }
    
    public abstract int task1(String[] theData);
    public abstract int task2(String[] theData);
    
    public void solve(){
        int t1 = task1((String[]) data.toArray());
        int t2 = task2((String[]) data.toArray());
        System.out.println("Answer to task 1: " + t1);
        System.out.println("Answer to task 2: " + t2);
    }
    
}
