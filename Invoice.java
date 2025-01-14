import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

    private String accessKey;
    private Long invoiceNumber;
    private LocalDate issueDate;
    private Long invoiceStatusId;
    private Long destinyBranchId;
    private BigDecimal invoiceValue;
    private LocalDateTime updatedDate;
    private String invoiceStatusDescription;

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Invoice invoice = (Invoice) object;
        return Objects.equals(accessKey, invoice.accessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey);
    }

}
