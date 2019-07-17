package live.winterfell.stringutils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class StringUtilsApplicationTests {

    @Test
    public void test_string_utils() {
        assertThat(StringUtils.isEmpty("")).isEqualTo(true);
        assertThat(StringUtils.isEmpty(null)).isEqualTo(true);
    }

}
