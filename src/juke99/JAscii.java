package juke99;

import com.google.common.base.Ascii;

public class JAscii {

    JAscii() {

    }

    public boolean equalsIgnoreCase(CharSequence cs1, CharSequence cs2) {
        return Ascii.equalsIgnoreCase(cs1, cs2);
    }
}