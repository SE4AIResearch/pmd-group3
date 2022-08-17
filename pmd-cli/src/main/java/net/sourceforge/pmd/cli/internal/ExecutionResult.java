/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cli.internal;

// TODO : Unify with PMD.StatusCode / CPD.StatusCode
public enum ExecutionResult {
    OK(0),
    ERROR(1),
    VIOLATIONS_FOUND(4);
    
    private final int exitCode;
    
    ExecutionResult(int exitCode) {
        this.exitCode = exitCode;
    }

    public int getExitCode() {
        return exitCode;
    }
}
