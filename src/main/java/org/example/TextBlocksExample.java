package org.example;

public class TextBlocksExample {

    /*
    Text Blocks start with """ followed by a new line, and end with """.
    The closing token can be at the end of the last line or in separate line such as is in the example above.
     */

    void previous() {
        String html = "";
        html += "<html>\n";
        html += "  <body>\n";
        html += "    <p>Hello, world</p>\n";
        html += "  </body>\n";
        html += "</html>\n";

        System.out.println(html);
    }

    void now() {
        String html = """
                <html>
                  <body>
                    <p>Hello, world</p>
                  </body>
                </html>
                """;

        System.out.println(html);
    }
}
