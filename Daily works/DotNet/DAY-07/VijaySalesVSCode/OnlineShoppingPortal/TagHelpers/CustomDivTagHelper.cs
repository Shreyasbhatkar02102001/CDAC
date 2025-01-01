using Microsoft.AspNetCore.Razor.TagHelpers;

namespace OnlineShoppingPortal.TagHelpers
{
    public class CustomDivTagHelper:TagHelper
    {

        public override void Process(TagHelperContext context, TagHelperOutput output)
        {
            // Set the tag name to 'div'

            output.TagName = "div";
            output.Attributes.SetAttribute("class", output.TagName);
            base.Process(context, output);
        }

    }
}
