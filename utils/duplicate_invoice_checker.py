invoices = ["INV101", "INV102", "INV101", "INV103"]

seen = set()
duplicates = set()

for invoice in invoices:
    if invoice in seen:
        duplicates.add(invoice)
    else:
        seen.add(invoice)

print("Duplicate invoices:", duplicates)


