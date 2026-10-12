# Day 6 — AI Stack-Trace Analysis

## Stack Trace 1: Insufficient Stock

**Copilot Explanation:**
- Top-level exception: `IllegalStateException`
- Original cause: `InsufficientStockException`
- Trigger: Requested quantity exceeds available stock.
- Suggested fixes: Validate stock and handle the exception gracefully.

**Evaluation:**
- Top-level exception — Correct.
- Original cause — Correct.
- Available stock is 3 — Correct.
- Requested quantity exceeds available stock — Correct.
- Stock validation — Reasonable recommendation.
- Partial fulfillment/backordering — Optional suggestion, not proven by the trace.

## Stack Trace 2: Invalid Quantity

**Copilot Explanation:**
- Top-level exception: `IllegalStateException`
- Original cause: `InvalidQuantityException`
- Trigger: Quantity is zero or negative.
- Suggested fixes: Validate input and show a clear error message.

**Evaluation:**
- Top-level exception — Correct.
- Original cause — Correct.
- Quantity must be greater than zero — Correct.
- Error originates in `OrderProcessor.processOrder` — Correct according to the trace.
- UI/API validation — Reasonable recommendation, not directly proven by the trace.

## Conclusion

Copilot correctly identified both exceptions, their causes, and the triggering conditions. Input and stock validation are reasonable recommendations. Backordering and UI/API validation are optional design suggestions, not facts established by the traces.