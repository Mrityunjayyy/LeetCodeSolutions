class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() -1;
        int j = num2.length() -1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        while(i > -1 || j > -1 || carry > 0)
        {
            int sum = 0;

            if(i > -1)
            {
                sum += (num1.charAt(i) - '0');
                i--;
            }

            if(j > -1)
            {
                sum += (num2.charAt(j) - '0');
                j--;
            }

            sum += carry;
            carry = sum/10;
            sum = sum % 10;

            sb.append(sum);
        }

        return sb.reverse().toString();
    }
}