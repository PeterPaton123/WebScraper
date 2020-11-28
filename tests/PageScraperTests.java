import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PageScraperTests {

  String sampleWebsite = "";
  PageScraper pageScraper = new SingleScraper(sampleWebsite);

  @Test
  public void throwsExceptionForEmptyWebsite() {

    try {
      nullPageScraper = new PageScraper("");
      fail("Should have thrown illegal argument exception");
    } catch (IllegalArgumentException e) {
       assertThat(e.getMessage(), containsString("Cannot scrape empty page"));
    }
  }

  @Test
  public void throwsExceptionForInvalidWebsite() {
    try {
      nullPageScraper = new PageScraper("abcde");
      fail("Should have thrown illegal argument exception");
    } catch (IllegalArgumentException e) {
      assertThat(e.getMessage(), containsString("Cannot scrape non-website"));
    }
  }

  @Test
  public void scrapeCorrectlyScrapesGivenSampleInput() {
    assertTrue(pageScraper.scrape().contains(" "));

  }
}
