package junitparams;

import java.io.*;
import java.util.*;

import junitparams.internal.*;

public class PersonMapper extends IdentityMapper {
    @Override
    public Object[] map(Reader reader) {
        Object[] map = super.map(reader);
        List<Object[]> result = new LinkedList<Object[]>();
        for (Object lineObj : map) {
            String line = (String) lineObj;
            result.add(new Object[] { line.substring(2), Integer.parseInt(line.substring(0, 1)) });
        }
        return result.toArray();
    }

}