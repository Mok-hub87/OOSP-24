package pattern7;

public class HtmlBuilder {

    private StringBuilder html = new StringBuilder();
    private int indent = 0;

    public HtmlBuilder(String rootTagName) {
        html.append("<").append(rootTagName).append(">\n");
        indent++;
    }

    public HtmlBuilder addChild(String tagName, String text) {
        indent();
        html.append("<").append(tagName).append(">").append(text).append("</").append(tagName).append(">\n");
        return this;
    }

    public HtmlBuilder addChild(String tagName) {
        indent();
        html.append("<").append(tagName).append(">\n");
        indent++;
        return this;
    }

    public HtmlBuilder addChild(String tagName, HtmlBuilder childBuilder) {
        indent();
        html.append("<").append(tagName).append(">\n");
        indent++;
        html.append(childBuilder.toString());
        indent--;
        indent();
        html.append("</").append(tagName).append(">\n");
        return this;
    }

    public HtmlBuilder closeChild() {
        indent--;
        return this;
    }

    private void indent() {
        for (int i = 0; i < indent; i++) {
            html.append("  ");
        }
    }

    @Override
    public String toString() {
        indent--;
        html.append("</").append(html.substring(0, html.indexOf(">")).trim()).append(">\n");
        return html.toString();
    }

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("html");
        builder.addChild("head").addChild("title", "My Page")
                .closeChild()
                .addChild("body")
                .addChild("h1", "Hello, World!")
                .addChild("p", "This is a paragraph.")
                .addChild("ul")
                .addChild("li", "Item 1")
                .addChild("li", "Item 2")
                .closeChild()
                .closeChild();

        System.out.println(builder.toString());
    }
}

