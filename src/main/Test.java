package main;

public class Test {
    public static void main(String[] args) {
        String html = "<p><span style=\"font-size:11.5pt;font-family:&quot;Segoe UI&quot;,sans-serif;mso-fareast-font-family:\n&quot;Times New Roman&quot;;color:#242424\">No&nbsp;</span><span style=\"border:none windowtext 1.0pt;\nmso-border-alt:none windowtext 0in;padding:0in\">Dallas</span>&nbsp;<span style=\"border:none windowtext 1.0pt;mso-border-alt:none windowtext 0in;\npadding:0in\">Streetcar</span>s running due to mechanical issues. Two shuttle vans are in service between EBJ Union and Bishop Arts stations. Our apologies for the inconvenience and thank you for your patience.</p>";


        // Remove HTML tags
        String cleanedText = html.replaceAll("<[^>]*>", "").replaceAll("&nbsp;", "");;

        System.out.println(cleanedText);
    }
/*

    fun main() {
        val html =
                "<p><span style=\"font-size:11.5pt;font-family:&quot;Segoe UI&quot;,sans-serif;mso-fareast-font-family:\n&quot;Times New Roman&quot;;color:#242424\">No&nbsp;</span><span style=\"border:none windowtext 1.0pt;\nmso-border-alt:none windowtext 0in;padding:0in\">Dallas</span>&nbsp;<span style=\"border:none windowtext 1.0pt;mso-border-alt:none windowtext 0in;\npadding:0in\">Streetcar</span>s running due to mechanical issues. Two shuttle vans are in service between EBJ Union and Bishop Arts stations. Our apologies for the inconvenience and thank you for your patience.</p>"
        println(html.removeHtmlTags())
    }


    private fun String.removeHtmlTags(): String = replace("<[^>]*>".toRegex(), "").replace("&nbsp;".toRegex(), " ")
*/

}
