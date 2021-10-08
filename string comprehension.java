/**
 * Performs run-length encoding on a string.  If the encoded string
 * would be longer than the input, then the input string is returned.
 * To make decoding simple and unambiguous, streaks are limited to
 * 9 characters long; longer streaks are broken up.
 */
public static String compress(String in) {
    if (in.length() < 3) return in;

    int n = in.length(), i = 0, o = 0;
    char[] out = new char[n + 1];
    out[o++] = in.charAt(0);
    out[o++] = '1';
    for (i = 1; i < n && o < n; i++) {
        if (in.charAt(i) == in.charAt(i - 1) && out[o - 1] != '9') {
            // Continued streak
            out[o - 1]++;
        } else {
            // New streak
            out[o++] = in.charAt(i);
            out[o++] = '1';
        }
    }
    return (i == n && o < n) ? new String(out, 0, o) : in;
}