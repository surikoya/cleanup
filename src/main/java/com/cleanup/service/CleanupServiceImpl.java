package com.cleanup.service;

import java.util.HashSet;
import java.util.Set;

public class CleanupServiceImpl implements CleanupService{

	public String cleanup(String givenString, String charsToRemove) {
		StringBuffer sb = new StringBuffer();
		final Set<Character> toRemoveSet = new HashSet<>();
		if (charsToRemove != null && !charsToRemove.isEmpty() && givenString != null) {
			char[] charArray = charsToRemove.toCharArray();
			for (char c: charArray) {
				toRemoveSet.add(c);
			}
			char[] givenCharArray = givenString.toCharArray();
			for (char c: givenCharArray) {
				if (!toRemoveSet.contains(c))
					sb.append(c);
			}
			return sb.toString();
		}
		return givenString;
	}


}
