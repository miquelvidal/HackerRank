select company_code,founder,count(l.*) from Company c left join
Lead_Manager l on c.company_code = l.company_code left join
Senior_Manager s on l.lead_manager_code=s.lead_manager_code and l.compay_code=s.company_code left join

