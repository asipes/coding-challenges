package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/defanging-an-ip-address">1108. Defanging an IP Address</a>
 */

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
