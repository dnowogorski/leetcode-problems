package com.dnowogorski.unique_emails;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            int atIndex = email.indexOf('@');
            String domain = email.substring(atIndex);
            uniqueEmails.add(
                    removeDots(
                            removeCharsAfterPlus(
                                    localName(email, atIndex))) + domain);
        }
        return uniqueEmails.size();
    }

    private String localName(String email, int atIndex) {
        return email.substring(0, atIndex);
    }

    private String removeCharsAfterPlus(String localName) {
        int plusIndex = localName.indexOf('+');
        return plusIndex != -1 ? localName.substring(0, plusIndex) : localName;
    }

    private String removeDots(String localName) {
        return localName.replace(".", "");
    }
}
