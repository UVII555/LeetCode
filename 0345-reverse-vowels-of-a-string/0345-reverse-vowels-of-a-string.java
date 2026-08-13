class Solution {

        // Check whether a character is a vowel
            public boolean isVowel(char ch) {
                    return ch == 'a' || ch == 'e' || ch == 'i' ||
                                   ch == 'o' || ch == 'u' ||
                                                  ch == 'A' || ch == 'E' || ch == 'I' ||
                                                                 ch == 'O' || ch == 'U';
                                                                     }

                                                                         public String reverseVowels(String s) {

                                                                                 // String is immutable, so convert it into char array
                                                                                         char[] arr = s.toCharArray();

                                                                                                 int left = 0;
                                                                                                         int right = arr.length - 1;

                                                                                                                 while (left < right) {

                                                                                                                             // If left is not a vowel, move left
                                                                                                                                         if (!isVowel(arr[left])) {
                                                                                                                                                         left++;
                                                                                                                                                                     }

                                                                                                                                                                                 // If right is not a vowel, move right
                                                                                                                                                                                             else if (!isVowel(arr[right])) {
                                                                                                                                                                                                             right--;
                                                                                                                                                                                                                         }

                                                                                                                                                                                                                                     // Both are vowels -> swap
                                                                                                                                                                                                                                                 else {
                                                                                                                                                                                                                                                                 char temp = arr[left];
                                                                                                                                                                                                                                                                                 arr[left] = arr[right];
                                                                                                                                                                                                                                                                                                 arr[right] = temp;

                                                                                                                                                                                                                                                                                                                 left++;
                                                                                                                                                                                                                                                                                                                                 right--;
                                                                                                                                                                                                                                                                                                                                             }
                                                                                                                                                                                                                                                                                                                                                     }

                                                                                                                                                                                                                                                                                                                                                             return new String(arr);
                                                                                                                                                                                                                                                                                                                                                                 }
                                                                                                                                                                                                                                                                                                                                                                 }
